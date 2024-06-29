import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class157 extends class222 {

    @OriginalMember(owner = "client!la", name = "hb", descriptor = "I")
    private int field2865 = 1;

    @OriginalMember(owner = "client!la", name = "jb", descriptor = "I")
    private int field2867 = 1;

    @OriginalMember(owner = "client!la", name = "lb", descriptor = "I")
    private int field2869 = 204;

    @OriginalMember(owner = "client!la", name = "Y", descriptor = "I")
    public static int field2856 = 0;

    @OriginalMember(owner = "client!la", name = "cb", descriptor = "Lsb;")
    public static class98 field2860 = class47.method368("rot:", 0);

    @OriginalMember(owner = "client!la", name = "bb", descriptor = "I")
    public static int field2859 = 0;

    @OriginalMember(owner = "client!la", name = "Z", descriptor = "I")
    public static int field2857 = 0;

    @OriginalMember(owner = "client!la", name = "db", descriptor = "Lsb;")
    private static class98 field2861 = class47.method368("Select", 0);

    @OriginalMember(owner = "client!la", name = "eb", descriptor = "Lsb;")
    public static class98 field2862 = field2861;

    @OriginalMember(owner = "client!la", name = "X", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!la", name = "ab", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!la", name = "fb", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!la", name = "gb", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!la", name = "ib", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!la", name = "kb", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!la", name = "W", descriptor = "[Lve;")
    public static class174[] field2854;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(III)Lsb;")
    public static final class98 method1135(int arg0, int arg1, int arg2) {
        ++field2864;
        int var3 = -arg2 + arg1;
        if (~var3 > 8) {
            return class254.field4452;
        } else if (~var3 > 5) {
            return class163.field2944;
        } else if (~var3 > 2) {
            return class23.field480;
        } else if (~var3 > -1) {
            return class12.field237;
        } else if (var3 > 9) {
            return class98.field1693;
        } else {
            if (arg0 != 9637) {
                method1138(-115, (byte) 99, -23);
            }
            if (~var3 < -7) {
                return class251.field4391;
            } else if (~var3 < -4) {
                return class244.field4245;
            } else {
                return ~var3 < -1 ? class2.field29 : class104.field1856;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field2866;
        if (arg0 < 35) {
            this.field2865 = -95;
        }
        int[] var3 = super.field3844.method22(0, arg1);
        if (super.field3844.field61) {
            for (int var4 = 0; ~class13.field253 < ~var4; ++var4) {
                int var5 = class261.field4577[var4];
                int var6 = this.field2867 * var5 >> 12;
                int var7 = class214.field3639[arg1];
                int var8 = this.field2865 * var7 >> 12;
                int var9 = var7 % (4096 / this.field2865) * this.field2865;
                int var10 = var5 % (4096 / this.field2867) * this.field2867;
                if (var9 < this.field2869) {
                    for (var6 -= var8; ~var6 > -1; var6 += 4) {
                    }
                    while (~var6 < -4) {
                        var6 -= 4;
                    }
                    if (var6 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var10 > ~this.field2869) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field2869 > var10) {
                    int var11;
                    for (var11 = var6 - var8; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method1136(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2863;
        int var8 = 0;
        int var9 = arg0;
        int var10 = -arg5 + arg2;
        int var11 = 0;
        int var12 = -arg5 + arg0;
        int var13 = arg0 * arg0;
        int var14 = arg2 * arg2;
        int var15 = var10 * var10;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var16 << 1;
        int var19 = var13 << 1;
        int var20 = var15 << 1;
        int var21 = arg0 << 1;
        int var22 = (-var21 + 1) * var14 + var19;
        int var23 = var12 << 1;
        int var24 = var13 - (var21 + -1) * var17;
        int var25 = (-var23 + 1) * var15 + var18;
        int var26 = var16 - (var23 + -1) * var20;
        int var27 = var14 << 2;
        int var28 = var15 << 2;
        int var29 = var13 << 2;
        int var30 = var16 << 2;
        int var31 = var19 * 3;
        int var32 = (var21 + -3) * var17;
        int var33 = var18 * 3;
        int var34 = (var23 + -3) * var20;
        int var35 = var29;
        int var36 = (arg0 + -1) * var27;
        int var37 = var30;
        int var38 = (var12 + -1) * var28;
        int[] var39 = class43.field721[arg6];
        int var40 = -79 / ((70 - arg3) / 32);
        class37.method305(-7, var39, arg4 - var10, arg7, arg4 - arg2);
        class37.method305(-7, var39, arg4 + var10, arg1, -var10 + arg4);
        class37.method305(-7, var39, arg2 + arg4, arg7, arg4 + var10);
        while (var9 > 0) {
            if (var22 < 0) {
                while (var22 < 0) {
                    var24 += var35;
                    var35 += var29;
                    var22 += var31;
                    ++var8;
                    var31 += var29;
                }
            }
            if (~var24 > -1) {
                var22 += var31;
                var31 += var29;
                var24 += var35;
                var35 += var29;
                ++var8;
            }
            var24 += -var32;
            var32 -= var27;
            var22 += -var36;
            int var41 = arg4 - -var8;
            boolean var42 = ~var12 <= ~var9;
            if (var42) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        ++var11;
                        var25 += var33;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (~var26 > -1) {
                    var25 += var33;
                    var26 += var37;
                    var37 += var30;
                    var33 += var30;
                    ++var11;
                }
                var25 += -var38;
                var26 += -var34;
                var34 -= var28;
                var38 -= var28;
            }
            var36 -= var27;
            int var43 = -var8 + arg4;
            --var9;
            int var44 = arg6 - -var9;
            int var45 = arg6 - var9;
            if (var42) {
                int var46 = arg4 + var11;
                int var47 = arg4 - var11;
                class37.method305(-7, class43.field721[var45], var47, arg7, var43);
                class37.method305(-7, class43.field721[var45], var46, arg1, var47);
                class37.method305(-7, class43.field721[var45], var41, arg7, var46);
                class37.method305(-7, class43.field721[var44], var47, arg7, var43);
                class37.method305(-7, class43.field721[var44], var46, arg1, var47);
                class37.method305(-7, class43.field721[var44], var41, arg7, var46);
            } else {
                class37.method305(-7, class43.field721[var45], var41, arg7, var43);
                class37.method305(-7, class43.field721[var44], var41, arg7, var43);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "(B)V")
    public static void method1137(byte arg0) {
        field2862 = null;
        field2860 = null;
        if (arg0 == 44) {
            field2861 = null;
            field2854 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IBI)Lq;")
    public static final class148 method1138(int arg0, byte arg1, int arg2) {
        int var3 = -57 % ((-43 - arg1) / 54);
        ++field2868;
        class148 var4 = class62.method455(-854073200, arg0);
        if (~arg2 == 0) {
            return var4;
        } else {
            return var4 != null && var4.field2751 != null && var4.field2751.length > arg2 ? var4.field2751[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (arg2 == 2) {
                        this.field2869 = arg0.method1487(33);
                    }
                } else {
                    this.field2865 = arg0.method1446(5350);
                }
            } else {
                this.field2867 = arg0.method1446(5350);
            }
            ++field2858;
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V")
    public class157() {
        super(0, true);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIII)V")
    public static final void method1139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var9 = arg5 + 1;
        class37.method305(-7, class43.field721[arg5], arg0, arg3, arg1);
        if (arg2 != 987146636) {
            field2857 = -69;
        }
        ++field2855;
        int var8 = arg4 - 1;
        class37.method305(-7, class43.field721[arg4], arg0, arg3, arg1);
        for (int var6 = var9; ~var6 >= ~var8; ++var6) {
            int[] var7 = class43.field721[var6];
            var7[arg1] = var7[arg0] = arg3;
        }
    }
}
